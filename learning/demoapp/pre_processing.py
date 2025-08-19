import re
import contractions
from bs4 import BeautifulSoup
from nltk.corpus import stopwords
from word2number import w2n
import nltk

# Download NLTK stopwords once
nltk.download('stopwords')
stop_words = set(stopwords.words('english'))

def simple_preprocess(text):
    # 1. Remove HTML tags
    text = BeautifulSoup(text, "html.parser").get_text()

    # 2. Expand contractions (e.g., "don't" → "do not")
    text = contractions.fix(text)

    # 3. Lowercase the text
    text = text.lower()

    # 4. Convert number words to digits (e.g., "five" → "5")
    words = text.split()
    converted_words = []
    for word in words:
        try:
            converted_word = str(w2n.word_to_num(word))
            converted_words.append(converted_word)
        except:
            converted_words.append(word)
    text = ' '.join(converted_words)

    # 5. Remove special characters (keep only letters and spaces)
    text = re.sub(r"[^a-zA-Z\s]", "", text)

    # 6. Remove extra whitespaces
    text = re.sub(r'\s+', ' ', text).strip()

    # 7. Remove stopwords (optional but helpful)
    words = text.split()
    filtered = [word for word in words if word not in stop_words]

    return ' '.join(filtered)
