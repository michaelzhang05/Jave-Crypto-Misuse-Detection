package a4;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13926b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f13927c = new u("VerificationSuccessful", 0, "Y");

    /* renamed from: d, reason: collision with root package name */
    public static final u f13928d = new u("VerificationDenied", 1, "N");

    /* renamed from: e, reason: collision with root package name */
    public static final u f13929e = new u("VerificationNotPerformed", 2, "U");

    /* renamed from: f, reason: collision with root package name */
    public static final u f13930f = new u("VerificationAttempted", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

    /* renamed from: g, reason: collision with root package name */
    public static final u f13931g = new u("ChallengeAdditionalAuth", 4, "C");

    /* renamed from: h, reason: collision with root package name */
    public static final u f13932h = new u("ChallengeDecoupledAuth", 5, "D");

    /* renamed from: i, reason: collision with root package name */
    public static final u f13933i = new u("VerificationRejected", 6, "R");

    /* renamed from: j, reason: collision with root package name */
    public static final u f13934j = new u("InformationOnly", 7, "I");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ u[] f13935k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ U5.a f13936l;

    /* renamed from: a, reason: collision with root package name */
    private final String f13937a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final u a(String str) {
            Object obj = null;
            if (str == null) {
                return null;
            }
            Iterator<E> it = u.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3255y.d(((u) next).b(), str)) {
                    obj = next;
                    break;
                }
            }
            return (u) obj;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        u[] a8 = a();
        f13935k = a8;
        f13936l = U5.b.a(a8);
        f13926b = new a(null);
    }

    private u(String str, int i8, String str2) {
        this.f13937a = str2;
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f13927c, f13928d, f13929e, f13930f, f13931g, f13932h, f13933i, f13934j};
    }

    public static U5.a c() {
        return f13936l;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f13935k.clone();
    }

    public final String b() {
        return this.f13937a;
    }
}
