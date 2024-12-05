package W0;

import U0.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements U0.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f11341a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11342b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f11343c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f11344d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11345e;

    /* renamed from: f, reason: collision with root package name */
    private final U0.d f11346f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11347g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map map, Map map2, U0.d dVar, boolean z8) {
        this.f11343c = new JsonWriter(writer);
        this.f11344d = map;
        this.f11345e = map2;
        this.f11346f = dVar;
        this.f11347g = z8;
    }

    private boolean t(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    private e w(String str, Object obj) {
        y();
        this.f11343c.name(str);
        if (obj == null) {
            this.f11343c.nullValue();
            return this;
        }
        return k(obj, false);
    }

    private e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f11343c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (this.f11342b) {
            e eVar = this.f11341a;
            if (eVar != null) {
                eVar.y();
                this.f11341a.f11342b = false;
                this.f11341a = null;
                this.f11343c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // U0.e
    public U0.e a(U0.c cVar, double d8) {
        return m(cVar.b(), d8);
    }

    @Override // U0.e
    public U0.e b(U0.c cVar, long j8) {
        return o(cVar.b(), j8);
    }

    @Override // U0.e
    public U0.e c(U0.c cVar, int i8) {
        return n(cVar.b(), i8);
    }

    @Override // U0.e
    public U0.e d(U0.c cVar, boolean z8) {
        return q(cVar.b(), z8);
    }

    @Override // U0.e
    public U0.e g(U0.c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    public e h(double d8) {
        y();
        this.f11343c.value(d8);
        return this;
    }

    public e i(int i8) {
        y();
        this.f11343c.value(i8);
        return this;
    }

    public e j(long j8) {
        y();
        this.f11343c.value(j8);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e k(Object obj, boolean z8) {
        Class<?> cls;
        int i8 = 0;
        if (z8 && t(obj)) {
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            throw new U0.b(String.format("%s cannot be encoded inline", cls));
        }
        if (obj == null) {
            this.f11343c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f11343c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return s((byte[]) obj);
            }
            this.f11343c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i8 < length) {
                    this.f11343c.value(r7[i8]);
                    i8++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i8 < length2) {
                    j(jArr[i8]);
                    i8++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i8 < length3) {
                    this.f11343c.value(dArr[i8]);
                    i8++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i8 < length4) {
                    this.f11343c.value(zArr[i8]);
                    i8++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    k(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    k(obj2, false);
                }
            }
            this.f11343c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f11343c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                k(it.next(), false);
            }
            this.f11343c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f11343c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    p((String) key, entry.getValue());
                } catch (ClassCastException e8) {
                    throw new U0.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                }
            }
            this.f11343c.endObject();
            return this;
        }
        U0.d dVar = (U0.d) this.f11344d.get(obj.getClass());
        if (dVar != null) {
            return v(dVar, obj, z8);
        }
        U0.f fVar = (U0.f) this.f11345e.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof f) {
                i(((f) obj).getNumber());
            } else {
                e(((Enum) obj).name());
            }
            return this;
        }
        return v(this.f11346f, obj, z8);
    }

    @Override // U0.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e e(String str) {
        y();
        this.f11343c.value(str);
        return this;
    }

    public e m(String str, double d8) {
        y();
        this.f11343c.name(str);
        return h(d8);
    }

    public e n(String str, int i8) {
        y();
        this.f11343c.name(str);
        return i(i8);
    }

    public e o(String str, long j8) {
        y();
        this.f11343c.name(str);
        return j(j8);
    }

    public e p(String str, Object obj) {
        if (this.f11347g) {
            return x(str, obj);
        }
        return w(str, obj);
    }

    public e q(String str, boolean z8) {
        y();
        this.f11343c.name(str);
        return f(z8);
    }

    @Override // U0.g
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e f(boolean z8) {
        y();
        this.f11343c.value(z8);
        return this;
    }

    public e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f11343c.nullValue();
        } else {
            this.f11343c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        y();
        this.f11343c.flush();
    }

    e v(U0.d dVar, Object obj, boolean z8) {
        if (!z8) {
            this.f11343c.beginObject();
        }
        dVar.a(obj, this);
        if (!z8) {
            this.f11343c.endObject();
        }
        return this;
    }
}
