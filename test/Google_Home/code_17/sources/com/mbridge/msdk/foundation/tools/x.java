package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21159a = "x";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f21160b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f21161c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f21162d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e, reason: collision with root package name */
    private static char[] f21163e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f21160b = hashMap;
        hashMap.put('v', 'A');
        f21160b.put('S', 'B');
        f21160b.put('o', 'C');
        f21160b.put('a', 'D');
        f21160b.put('j', 'E');
        f21160b.put('c', 'F');
        f21160b.put('7', 'G');
        f21160b.put('d', 'H');
        f21160b.put('R', 'I');
        f21160b.put('z', 'J');
        f21160b.put('p', 'K');
        f21160b.put('W', 'L');
        f21160b.put('i', 'M');
        f21160b.put('f', 'N');
        f21160b.put('G', 'O');
        f21160b.put('y', 'P');
        f21160b.put('N', 'Q');
        f21160b.put('x', 'R');
        f21160b.put('Z', 'S');
        f21160b.put('n', 'T');
        f21160b.put('V', 'U');
        f21160b.put('5', 'V');
        f21160b.put('k', 'W');
        f21160b.put('+', 'X');
        f21160b.put('D', 'Y');
        f21160b.put('H', 'Z');
        f21160b.put('L', 'a');
        f21160b.put('Y', 'b');
        f21160b.put('h', 'c');
        f21160b.put('J', 'd');
        f21160b.put('4', 'e');
        f21160b.put('6', 'f');
        f21160b.put('l', 'g');
        f21160b.put('t', 'h');
        f21160b.put('0', 'i');
        f21160b.put('U', 'j');
        f21160b.put('3', 'k');
        f21160b.put('Q', 'l');
        f21160b.put('r', 'm');
        f21160b.put('g', 'n');
        f21160b.put('E', 'o');
        f21160b.put('u', 'p');
        f21160b.put('q', 'q');
        f21160b.put('8', 'r');
        f21160b.put('s', 's');
        f21160b.put('w', 't');
        f21160b.put('/', 'u');
        f21160b.put('X', 'v');
        f21160b.put('M', 'w');
        f21160b.put('e', 'x');
        f21160b.put('B', 'y');
        f21160b.put('A', 'z');
        f21160b.put('T', '0');
        f21160b.put('2', '1');
        f21160b.put('F', '2');
        f21160b.put('b', '3');
        f21160b.put('9', '4');
        f21160b.put('P', '5');
        f21160b.put('1', '6');
        f21160b.put('O', '7');
        f21160b.put('I', '8');
        f21160b.put('K', '9');
        f21160b.put('m', '+');
        f21160b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f21161c = hashMap2;
        hashMap2.put('A', 'v');
        f21161c.put('B', 'S');
        f21161c.put('C', 'o');
        f21161c.put('D', 'a');
        f21161c.put('E', 'j');
        f21161c.put('F', 'c');
        f21161c.put('G', '7');
        f21161c.put('H', 'd');
        f21161c.put('I', 'R');
        f21161c.put('J', 'z');
        f21161c.put('K', 'p');
        f21161c.put('L', 'W');
        f21161c.put('M', 'i');
        f21161c.put('N', 'f');
        f21161c.put('O', 'G');
        f21161c.put('P', 'y');
        f21161c.put('Q', 'N');
        f21161c.put('R', 'x');
        f21161c.put('S', 'Z');
        f21161c.put('T', 'n');
        f21161c.put('U', 'V');
        f21161c.put('V', '5');
        f21161c.put('W', 'k');
        f21161c.put('X', '+');
        f21161c.put('Y', 'D');
        f21161c.put('Z', 'H');
        f21161c.put('a', 'L');
        f21161c.put('b', 'Y');
        f21161c.put('c', 'h');
        f21161c.put('d', 'J');
        f21161c.put('e', '4');
        f21161c.put('f', '6');
        f21161c.put('g', 'l');
        f21161c.put('h', 't');
        f21161c.put('i', '0');
        f21161c.put('j', 'U');
        f21161c.put('k', '3');
        f21161c.put('l', 'Q');
        f21161c.put('m', 'r');
        f21161c.put('n', 'g');
        f21161c.put('o', 'E');
        f21161c.put('p', 'u');
        f21161c.put('q', 'q');
        f21161c.put('r', '8');
        f21161c.put('s', 's');
        f21161c.put('t', 'w');
        f21161c.put('u', '/');
        f21161c.put('v', 'X');
        f21161c.put('w', 'M');
        f21161c.put('x', 'e');
        f21161c.put('y', 'B');
        f21161c.put('z', 'A');
        f21161c.put('0', 'T');
        f21161c.put('1', '2');
        f21161c.put('2', 'F');
        f21161c.put('3', 'b');
        f21161c.put('4', '9');
        f21161c.put('5', 'P');
        f21161c.put('6', '1');
        f21161c.put('7', 'O');
        f21161c.put('8', 'I');
        f21161c.put('9', 'K');
        f21161c.put('+', 'm');
        f21161c.put('/', 'C');
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
