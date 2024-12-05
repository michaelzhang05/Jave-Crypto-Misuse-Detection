package kotlin.reflect.x.internal.l0.e.a0.b;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes2.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            l.f(str, "name");
            l.f(str2, "desc");
            this.a = str;
            this.f20395b = str2;
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String a() {
            return c() + ':' + b();
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String b() {
            return this.f20395b;
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String c() {
            return this.a;
        }

        public final String d() {
            return c();
        }

        public final String e() {
            return b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(c(), aVar.c()) && l.a(b(), aVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class b extends d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            l.f(str, "name");
            l.f(str2, "desc");
            this.a = str;
            this.f20396b = str2;
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String a() {
            return c() + b();
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String b() {
            return this.f20396b;
        }

        @Override // kotlin.reflect.x.internal.l0.e.a0.b.d
        public String c() {
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
            return l.a(c(), bVar.c()) && l.a(b(), bVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(g gVar) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
