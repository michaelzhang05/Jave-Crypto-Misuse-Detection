package f4;

import android.util.Base64;
import android.util.JsonWriter;
import d4.f;
import d4.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class e implements d4.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f6602a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6603b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f6604c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6605d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f6606e;

    /* renamed from: f, reason: collision with root package name */
    private final d4.d f6607f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6608g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map map, Map map2, d4.d dVar, boolean z5) {
        this.f6604c = new JsonWriter(writer);
        this.f6605d = map;
        this.f6606e = map2;
        this.f6607f = dVar;
        this.f6608g = z5;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) {
        t();
        this.f6604c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f6604c.nullValue();
        return this;
    }

    private e s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.f6604c.name(str);
        return h(obj, false);
    }

    private void t() {
        if (!this.f6603b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f6602a;
        if (eVar != null) {
            eVar.t();
            this.f6602a.f6603b = false;
            this.f6602a = null;
            this.f6604c.endObject();
        }
    }

    @Override // d4.e
    public d4.e c(d4.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    @Override // d4.e
    public d4.e d(d4.c cVar, int i6) {
        return j(cVar.b(), i6);
    }

    @Override // d4.e
    public d4.e e(d4.c cVar, long j6) {
        return k(cVar.b(), j6);
    }

    public e f(int i6) {
        t();
        this.f6604c.value(i6);
        return this;
    }

    public e g(long j6) {
        t();
        this.f6604c.value(j6);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e h(Object obj, boolean z5) {
        int i6 = 0;
        if (z5 && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new d4.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f6604c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f6604c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f6604c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f6604c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f6604c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e6) {
                        throw new d4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                this.f6604c.endObject();
                return this;
            }
            d4.d dVar = (d4.d) this.f6605d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z5);
            }
            f fVar = (f) this.f6606e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f6607f, obj, z5);
            }
            a(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f6604c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i6 < length) {
                this.f6604c.value(r6[i6]);
                i6++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i6 < length2) {
                g(jArr[i6]);
                i6++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i6 < length3) {
                this.f6604c.value(dArr[i6]);
                i6++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i6 < length4) {
                this.f6604c.value(zArr[i6]);
                i6++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f6604c.endArray();
        return this;
    }

    @Override // d4.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e a(String str) {
        t();
        this.f6604c.value(str);
        return this;
    }

    public e j(String str, int i6) {
        t();
        this.f6604c.name(str);
        return f(i6);
    }

    public e k(String str, long j6) {
        t();
        this.f6604c.name(str);
        return g(j6);
    }

    public e l(String str, Object obj) {
        return this.f6608g ? s(str, obj) : r(str, obj);
    }

    @Override // d4.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e b(boolean z5) {
        t();
        this.f6604c.value(z5);
        return this;
    }

    public e n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.f6604c.nullValue();
        } else {
            this.f6604c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        t();
        this.f6604c.flush();
    }

    e q(d4.d dVar, Object obj, boolean z5) {
        if (!z5) {
            this.f6604c.beginObject();
        }
        dVar.a(obj, this);
        if (!z5) {
            this.f6604c.endObject();
        }
        return this;
    }
}
