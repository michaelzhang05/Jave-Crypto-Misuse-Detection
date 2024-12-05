package t2;

import androidx.core.os.EnvironmentCompat;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3787h extends AbstractC3790k {

    /* renamed from: f, reason: collision with root package name */
    private final String f38227f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38228g;

    public C3787h(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.f38227f = str;
        this.f38228g = str2;
    }

    @Override // t2.AbstractC3790k
    public String a() {
        String str = this.f38228g;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }

    public final String g() {
        return this.f38227f;
    }
}
