package i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    c f6945a;

    /* renamed from: b, reason: collision with root package name */
    private c f6946b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f6947c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f6948d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // i.b.e
        c c(c cVar) {
            return cVar.f6952d;
        }

        @Override // i.b.e
        c d(c cVar) {
            return cVar.f6951c;
        }
    }

    /* renamed from: i.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0105b extends e {
        C0105b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // i.b.e
        c c(c cVar) {
            return cVar.f6951c;
        }

        @Override // i.b.e
        c d(c cVar) {
            return cVar.f6952d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        final Object f6949a;

        /* renamed from: b, reason: collision with root package name */
        final Object f6950b;

        /* renamed from: c, reason: collision with root package name */
        c f6951c;

        /* renamed from: d, reason: collision with root package name */
        c f6952d;

        c(Object obj, Object obj2) {
            this.f6949a = obj;
            this.f6950b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6949a.equals(cVar.f6949a) && this.f6950b.equals(cVar.f6950b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f6949a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f6950b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f6949a.hashCode() ^ this.f6950b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f6949a + "=" + this.f6950b;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private c f6953a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f6954b = true;

        d() {
        }

        @Override // i.b.f
        void b(c cVar) {
            c cVar2 = this.f6953a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f6952d;
                this.f6953a = cVar3;
                this.f6954b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f6954b) {
                this.f6954b = false;
                cVar = b.this.f6945a;
            } else {
                c cVar2 = this.f6953a;
                cVar = cVar2 != null ? cVar2.f6951c : null;
            }
            this.f6953a = cVar;
            return this.f6953a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6954b) {
                return b.this.f6945a != null;
            }
            c cVar = this.f6953a;
            return (cVar == null || cVar.f6951c == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        c f6956a;

        /* renamed from: b, reason: collision with root package name */
        c f6957b;

        e(c cVar, c cVar2) {
            this.f6956a = cVar2;
            this.f6957b = cVar;
        }

        private c f() {
            c cVar = this.f6957b;
            c cVar2 = this.f6956a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // i.b.f
        public void b(c cVar) {
            if (this.f6956a == cVar && cVar == this.f6957b) {
                this.f6957b = null;
                this.f6956a = null;
            }
            c cVar2 = this.f6956a;
            if (cVar2 == cVar) {
                this.f6956a = c(cVar2);
            }
            if (this.f6957b == cVar) {
                this.f6957b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f6957b;
            this.f6957b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6957b != null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        abstract void b(c cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Iterator h() {
        C0105b c0105b = new C0105b(this.f6946b, this.f6945a);
        this.f6947c.put(c0105b, Boolean.FALSE);
        return c0105b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((Map.Entry) it.next()).hashCode();
        }
        return i6;
    }

    public Map.Entry i() {
        return this.f6945a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f6945a, this.f6946b);
        this.f6947c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c j(Object obj) {
        c cVar = this.f6945a;
        while (cVar != null && !cVar.f6949a.equals(obj)) {
            cVar = cVar.f6951c;
        }
        return cVar;
    }

    public d k() {
        d dVar = new d();
        this.f6947c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry l() {
        return this.f6946b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c m(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f6948d++;
        c cVar2 = this.f6946b;
        if (cVar2 == null) {
            this.f6945a = cVar;
        } else {
            cVar2.f6951c = cVar;
            cVar.f6952d = cVar2;
        }
        this.f6946b = cVar;
        return cVar;
    }

    public Object n(Object obj, Object obj2) {
        c j6 = j(obj);
        if (j6 != null) {
            return j6.f6950b;
        }
        m(obj, obj2);
        return null;
    }

    public Object o(Object obj) {
        c j6 = j(obj);
        if (j6 == null) {
            return null;
        }
        this.f6948d--;
        if (!this.f6947c.isEmpty()) {
            Iterator it = this.f6947c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(j6);
            }
        }
        c cVar = j6.f6952d;
        c cVar2 = j6.f6951c;
        if (cVar != null) {
            cVar.f6951c = cVar2;
        } else {
            this.f6945a = cVar2;
        }
        c cVar3 = j6.f6951c;
        if (cVar3 != null) {
            cVar3.f6952d = cVar;
        } else {
            this.f6946b = cVar;
        }
        j6.f6951c = null;
        j6.f6952d = null;
        return j6.f6950b;
    }

    public int size() {
        return this.f6948d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
