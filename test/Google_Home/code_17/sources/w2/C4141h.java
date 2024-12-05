package w2;

import androidx.core.os.EnvironmentCompat;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4141h extends AbstractC4144k {

    /* renamed from: f, reason: collision with root package name */
    private final String f40354f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40355g;

    public C4141h(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.f40354f = str;
        this.f40355g = str2;
    }

    @Override // w2.AbstractC4144k
    public String a() {
        String str = this.f40355g;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }

    public final String g() {
        return this.f40354f;
    }
}
