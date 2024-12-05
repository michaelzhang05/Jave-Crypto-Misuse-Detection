package w2;

import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4138e extends AbstractC4144k {

    /* renamed from: f, reason: collision with root package name */
    private final String f40353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4138e(Throwable cause, String str) {
        super(null, null, 0, cause, cause.getMessage(), 7, null);
        AbstractC3255y.i(cause, "cause");
        this.f40353f = str;
    }

    @Override // w2.AbstractC4144k
    public String a() {
        String str = this.f40353f;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }
}
