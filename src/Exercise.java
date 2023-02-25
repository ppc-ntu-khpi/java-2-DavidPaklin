public class Exercise {
  public static boolean Calculate(String word) {
    String lowercaseWord = word.toLowerCase(); // робимо всі букви в слові маленькими 
    return lowercaseWord.equals(new StringBuilder(lowercaseWord).reverse().toString()); // реверсуємо слово та порівнюємо його з заданим нами словом
  }
}
