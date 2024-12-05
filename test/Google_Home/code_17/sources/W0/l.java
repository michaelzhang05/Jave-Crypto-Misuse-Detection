package w0;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class l {

    /* loaded from: classes3.dex */
    static class a implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final k f40332a;

        /* renamed from: b, reason: collision with root package name */
        volatile transient boolean f40333b;

        /* renamed from: c, reason: collision with root package name */
        transient Object f40334c;

        a(k kVar) {
            this.f40332a = (k) h.i(kVar);
        }

        @Override // w0.k
        public Object get() {
            if (!this.f40333b) {
                synchronized (this) {
                    try {
                        if (!this.f40333b) {
                            Object obj = this.f40332a.get();
                            this.f40334c = obj;
                            this.f40333b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC4122e.a(this.f40334c);
        }

        public String toString() {
            Object obj;
            if (this.f40333b) {
                String valueOf = String.valueOf(this.f40334c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f40332a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    static class b implements k {

        /* renamed from: a, reason: collision with root package name */
        volatile k f40335a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f40336b;

        /* renamed from: c, reason: collision with root package name */
        Object f40337c;

        b(k kVar) {
            this.f40335a = (k) h.i(kVar);
        }

        @Override // w0.k
        public Object get() {
            if (!this.f40336b) {
                synchronized (this) {
                    try {
                        if (!this.f40336b) {
                            k kVar = this.f40335a;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f40337c = obj;
                            this.f40336b = true;
                            this.f40335a = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC4122e.a(this.f40337c);
        }

        public String toString() {
            Object obj = this.f40335a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f40337c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static class c implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object f40338a;

        c(Object obj) {
            this.f40338a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC4123f.a(this.f40338a, ((c) obj).f40338a);
            }
            return false;
        }

        @Override // w0.k
        public Object get() {
            return this.f40338a;
        }

        public int hashCode() {
            return AbstractC4123f.b(this.f40338a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f40338a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        if (!(kVar instanceof b) && !(kVar instanceof a)) {
            if (kVar instanceof Serializable) {
                return new a(kVar);
            }
            return new b(kVar);
        }
        return kVar;
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
