package kotlin.reflect.x.internal.l0.e.a0.b;

import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.reflect.x.internal.l0.e.z.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f20397g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final e f20398h = new e(1, 7, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final e f20399i = new e(new int[0]);

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20400j;

    /* compiled from: JvmMetadataVersion.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.f(iArr, "versionArray");
        this.f20400j = z;
    }

    public boolean h() {
        boolean z;
        if (a() == 1 && b() == 0) {
            return false;
        }
        if (this.f20400j) {
            z = f(f20398h);
        } else {
            int a2 = a();
            e eVar = f20398h;
            z = a2 == eVar.a() && b() <= eVar.b() + 1;
        }
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... iArr) {
        this(iArr, false);
        l.f(iArr, "numbers");
    }
}
