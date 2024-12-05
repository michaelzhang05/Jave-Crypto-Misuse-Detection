package T;

import Q.C1393i;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9965a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9966b;

    /* renamed from: c, reason: collision with root package name */
    private final C1393i f9967c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9968d;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f9966b = sb;
        this.f9965a = str;
        this.f9967c = new C1393i(str);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable(this.f9965a, i8)) {
            i8++;
        }
        this.f9968d = i8;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f9965a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f9965a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f9966b.concat(str);
    }

    public boolean d(int i8) {
        if (this.f9968d <= i8) {
            return true;
        }
        return false;
    }
}
