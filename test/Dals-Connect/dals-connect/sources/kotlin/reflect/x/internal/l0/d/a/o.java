package kotlin.reflect.x.internal.l0.d.a;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.n0.g;
import kotlin.reflect.x.internal.l0.d.a.n0.u;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: JavaClassFinder.kt */
/* loaded from: classes2.dex */
public interface o {

    /* compiled from: JavaClassFinder.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ u a(o oVar, c cVar, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            return oVar.c(cVar, z);
        }
    }

    g a(b bVar);

    Set<String> b(c cVar);

    u c(c cVar, boolean z);

    /* compiled from: JavaClassFinder.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final kotlin.reflect.x.internal.l0.f.b a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f20109b;

        /* renamed from: c, reason: collision with root package name */
        private final g f20110c;

        public b(kotlin.reflect.x.internal.l0.f.b bVar, byte[] bArr, g gVar) {
            l.f(bVar, "classId");
            this.a = bVar;
            this.f20109b = bArr;
            this.f20110c = gVar;
        }

        public final kotlin.reflect.x.internal.l0.f.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.a, bVar.a) && l.a(this.f20109b, bVar.f20109b) && l.a(this.f20110c, bVar.f20110c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            byte[] bArr = this.f20109b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            g gVar = this.f20110c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f20109b) + ", outerClass=" + this.f20110c + ')';
        }

        public /* synthetic */ b(kotlin.reflect.x.internal.l0.f.b bVar, byte[] bArr, g gVar, int i2, kotlin.jvm.internal.g gVar2) {
            this(bVar, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? null : gVar);
        }
    }
}
