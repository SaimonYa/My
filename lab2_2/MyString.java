package lab2_2;

import java.util.Arrays;

final public class MyString {
    final char[] charArray;

    public MyString(char[] charArray) {
        this.charArray = charArray;
    }
    boolean isEmpty() {
        return charArray.length == 0;
    }
    int length() {
        return charArray.length;
    }
    @Override
    public String toString() {
        String stringFromCharArray = new String(charArray);
        return stringFromCharArray;
    }
    int compareTo(MyString anotherString) {
        int compared = 0;
        for (int i = 0; i < Math.min(this.length(), anotherString.length()); i++) {
            if (this.charAt(i) != anotherString.charAt(i)) {
                compared = this.charAt(i) - anotherString.charAt(i);
                break;
            }
        }
        return compared;
    }

    public MyString concat(MyString s1) {
        char[] newArr = new char[charArray.length + s1.charArray.length];
        for (int i = 0; i < charArray.length; i++)
            newArr[i] = charArray[i];
        for (int i = charArray.length; i < newArr.length; i++)
            newArr[i] = s1.charArray[i - charArray.length];
        MyString newStr = new MyString(newArr);
        return newStr;
    }

    MyString substring(int beginIndex, int endIndex) {
        char[] result = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            result[i - beginIndex] = charAt(i);
        }
        return new MyString(result);
    }

    public char charAt(int index) {
        return charArray[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(charArray, myString.charArray);
    }

    public MyString trim() {
        char[] charArray2 = new char[charArray.length - 1];
        System.arraycopy(charArray, 0, charArray2, 0, charArray2.length);
        MyString newStr = new MyString(charArray2);
        return newStr;
    }

    public static void main(String[] args) {
        char[] charArray = new char[]{'h', 'i', ' ', 't', 'h', 'e', 'r', 'e', ' ', ' ', ' '};
        MyString string = new MyString(charArray);
        System.out.println(string.toString());
        MyString s1 = new MyString(
                new char[] {' ', 'p', 'i', 'd', 'i'}
        );
        System.out.println(string.concat(s1));
        int index = 3;
        System.out.println(string.charAt(index));
        System.out.println(string.trim());
    }
}
