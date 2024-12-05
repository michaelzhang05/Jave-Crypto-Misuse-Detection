package kotlin.reflect.x.internal.l0.d.b;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.j.b.u;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes2.dex */
public interface o extends u {

    /* compiled from: KotlinClassFinder.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.f0.x.e.l0.d.b.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0310a extends a {
            private final byte[] a;

            public final byte[] b() {
                return this.a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        /* loaded from: classes2.dex */
        public static final class b extends a {
            private final q a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f20322b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, byte[] bArr) {
                super(null);
                l.f(qVar, "kotlinJvmBinaryClass");
                this.a = qVar;
                this.f20322b = bArr;
            }

            public final q b() {
                return this.a;
            }

            public /* synthetic */ b(q qVar, byte[] bArr, int i2, g gVar) {
                this(qVar, (i2 & 2) != 0 ? null : bArr);
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final q a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }
    }

    a a(kotlin.reflect.x.internal.l0.d.a.n0.g gVar);

    a c(b bVar);
}
