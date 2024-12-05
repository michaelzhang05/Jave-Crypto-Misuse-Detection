package T1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9701a = new a();

    /* loaded from: classes4.dex */
    public static class a implements S1.j {
        @Override // S1.j
        public boolean a(Field field, Method method) {
            U1.a aVar = (U1.a) method.getAnnotation(U1.a.class);
            if (aVar != null && aVar.value()) {
                return false;
            }
            return true;
        }
    }

    public static String a(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i8 = 1; i8 < length; i8++) {
            cArr[i8 + 3] = str.charAt(i8);
        }
        return new String(cArr);
    }

    public static String b(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i8 = 1; i8 < length; i8++) {
            cArr[i8 + 2] = str.charAt(i8);
        }
        return new String(cArr);
    }
}
