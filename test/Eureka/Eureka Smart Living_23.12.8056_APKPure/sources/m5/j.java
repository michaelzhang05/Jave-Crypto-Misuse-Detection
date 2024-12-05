package m5;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f7950a = new HashMap(20);

    /* renamed from: b, reason: collision with root package name */
    private Bundle f7951b;

    public boolean a(String str, boolean z5) {
        String str2 = (String) this.f7950a.get(str.toLowerCase(Locale.ENGLISH));
        return str2 != null ? Boolean.parseBoolean(str2) : z5;
    }

    public int b(String str, int i6) {
        String str2 = (String) this.f7950a.get(str.toLowerCase(Locale.ENGLISH));
        return str2 != null ? (int) Long.decode(str2).longValue() : i6;
    }

    public String c(String str, String str2) {
        String str3 = (String) this.f7950a.get(str.toLowerCase(Locale.ENGLISH));
        return str3 != null ? str3 : str2;
    }

    public void d(String str, String str2) {
        this.f7950a.put(str.toLowerCase(Locale.ENGLISH), str2);
    }

    public void e(Bundle bundle) {
        this.f7951b = bundle;
    }
}
