package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20104a = "x";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f20105b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f20106c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f20107d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f20108e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f20105b = hashMap;
        hashMap.put('v', 'A');
        f20105b.put('S', 'B');
        f20105b.put('o', 'C');
        f20105b.put('a', 'D');
        f20105b.put('j', 'E');
        f20105b.put('c', 'F');
        f20105b.put('7', 'G');
        f20105b.put('d', 'H');
        f20105b.put('R', 'I');
        f20105b.put('z', 'J');
        f20105b.put('p', 'K');
        f20105b.put('W', 'L');
        f20105b.put('i', 'M');
        f20105b.put('f', 'N');
        f20105b.put('G', 'O');
        f20105b.put('y', 'P');
        f20105b.put('N', 'Q');
        f20105b.put('x', 'R');
        f20105b.put('Z', 'S');
        f20105b.put('n', 'T');
        f20105b.put('V', 'U');
        f20105b.put('5', 'V');
        f20105b.put('k', 'W');
        f20105b.put('+', 'X');
        f20105b.put('D', 'Y');
        f20105b.put('H', 'Z');
        f20105b.put('L', 'a');
        f20105b.put('Y', 'b');
        f20105b.put('h', 'c');
        f20105b.put('J', 'd');
        f20105b.put('4', 'e');
        f20105b.put('6', 'f');
        f20105b.put('l', 'g');
        f20105b.put('t', 'h');
        f20105b.put('0', 'i');
        f20105b.put('U', 'j');
        f20105b.put('3', 'k');
        f20105b.put('Q', 'l');
        f20105b.put('r', 'm');
        f20105b.put('g', 'n');
        f20105b.put('E', 'o');
        f20105b.put('u', 'p');
        f20105b.put('q', 'q');
        f20105b.put('8', 'r');
        f20105b.put('s', 's');
        f20105b.put('w', 't');
        f20105b.put('/', 'u');
        f20105b.put('X', 'v');
        f20105b.put('M', 'w');
        f20105b.put('e', 'x');
        f20105b.put('B', 'y');
        f20105b.put('A', 'z');
        f20105b.put('T', '0');
        f20105b.put('2', '1');
        f20105b.put('F', '2');
        f20105b.put('b', '3');
        f20105b.put('9', '4');
        f20105b.put('P', '5');
        f20105b.put('1', '6');
        f20105b.put('O', '7');
        f20105b.put('I', '8');
        f20105b.put('K', '9');
        f20105b.put('m', '+');
        f20105b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f20106c = hashMap2;
        hashMap2.put('A', 'v');
        f20106c.put('B', 'S');
        f20106c.put('C', 'o');
        f20106c.put('D', 'a');
        f20106c.put('E', 'j');
        f20106c.put('F', 'c');
        f20106c.put('G', '7');
        f20106c.put('H', 'd');
        f20106c.put('I', 'R');
        f20106c.put('J', 'z');
        f20106c.put('K', 'p');
        f20106c.put('L', 'W');
        f20106c.put('M', 'i');
        f20106c.put('N', 'f');
        f20106c.put('O', 'G');
        f20106c.put('P', 'y');
        f20106c.put('Q', 'N');
        f20106c.put('R', 'x');
        f20106c.put('S', 'Z');
        f20106c.put('T', 'n');
        f20106c.put('U', 'V');
        f20106c.put('V', '5');
        f20106c.put('W', 'k');
        f20106c.put('X', '+');
        f20106c.put('Y', 'D');
        f20106c.put('Z', 'H');
        f20106c.put('a', 'L');
        f20106c.put('b', 'Y');
        f20106c.put('c', 'h');
        f20106c.put('d', 'J');
        f20106c.put('e', '4');
        f20106c.put('f', '6');
        f20106c.put('g', 'l');
        f20106c.put('h', 't');
        f20106c.put('i', '0');
        f20106c.put('j', 'U');
        f20106c.put('k', '3');
        f20106c.put('l', 'Q');
        f20106c.put('m', 'r');
        f20106c.put('n', 'g');
        f20106c.put('o', 'E');
        f20106c.put('p', 'u');
        f20106c.put('q', 'q');
        f20106c.put('r', '8');
        f20106c.put('s', 's');
        f20106c.put('t', 'w');
        f20106c.put('u', '/');
        f20106c.put('v', 'X');
        f20106c.put('w', 'M');
        f20106c.put('x', 'e');
        f20106c.put('y', 'B');
        f20106c.put('z', 'A');
        f20106c.put('0', 'T');
        f20106c.put('1', '2');
        f20106c.put('2', 'F');
        f20106c.put('3', 'b');
        f20106c.put('4', '9');
        f20106c.put('5', 'P');
        f20106c.put('6', '1');
        f20106c.put('7', 'O');
        f20106c.put('8', 'I');
        f20106c.put('9', 'K');
        f20106c.put('+', 'm');
        f20106c.put('/', 'C');
    }

    private x() {
    }

    public static String a(String str) {
        return ae.a(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return ae.b(str);
    }
}
