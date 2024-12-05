package p0;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f8745c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f8746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8747b;

    /* loaded from: classes.dex */
    public static class a extends t {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    t(String str, String str2) {
        this.f8746a = str;
        this.f8747b = str2;
        f8745c.add(this);
    }
}
