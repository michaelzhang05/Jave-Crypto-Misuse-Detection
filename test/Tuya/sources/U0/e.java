package U0;

import S0.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements S0.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f11063a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11064b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f11065c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f11066d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11067e;

    /* renamed from: f, reason: collision with root package name */
    private final S0.d f11068f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11069g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map map, Map map2, S0.d dVar, boolean z8) {
        this.f11065c = new JsonWriter(writer);
        this.f11066d = map;
        this.f11067e = map2;
        this.f11068f = dVar;
        this.f11069g = z8;
    }

    private boolean t(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    private e w(String str, Object obj) {
        y();
        this.f11065c.name(str);
        if (obj == null) {
            this.f11065c.nullValue();
            return this;
        }
        return k(obj, false);
    }

    private e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f11065c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (this.f11064b) {
            e eVar = this.f11063a;
            if (eVar != null) {
                eVar.y();
                this.f11063a.f11064b = false;
                this.f11063a = null;
                this.f11065c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // S0.e
    public S0.e a(S0.c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    @Override // S0.e
    public S0.e b(S0.c cVar, double d8) {
        return m(cVar.b(), d8);
    }

    @Override // S0.e
    public S0.e c(S0.c cVar, int i8) {
        return n(cVar.b(), i8);
    }

    @Override // S0.e
    public S0.e d(S0.c cVar, long j8) {
        return o(cVar.b(), j8);
    }

    @Override // S0.e
    public S0.e e(S0.c cVar, boolean z8) {
        return q(cVar.b(), z8);
    }

    public e h(double d8) {
        y();
        this.f11065c.value(d8);
        return this;
    }

    public e i(int i8) {
        y();
        this.f11065c.value(i8);
        return this;
    }

    public e j(long j8) {
        y();
        this.f11065c.value(j8);
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
            throw new S0.b(String.format("%s cannot be encoded inline", cls));
        }
        if (obj == null) {
            this.f11065c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f11065c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return s((byte[]) obj);
            }
            this.f11065c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i8 < length) {
                    this.f11065c.value(r7[i8]);
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
                    this.f11065c.value(dArr[i8]);
                    i8++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i8 < length4) {
                    this.f11065c.value(zArr[i8]);
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
            this.f11065c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f11065c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                k(it.next(), false);
            }
            this.f11065c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f11065c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    p((String) key, entry.getValue());
                } catch (ClassCastException e8) {
                    throw new S0.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                }
            }
            this.f11065c.endObject();
            return this;
        }
        S0.d dVar = (S0.d) this.f11066d.get(obj.getClass());
        if (dVar != null) {
            return v(dVar, obj, z8);
        }
        S0.f fVar = (S0.f) this.f11067e.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof f) {
                i(((f) obj).getNumber());
            } else {
                f(((Enum) obj).name());
            }
            return this;
        }
        return v(this.f11068f, obj, z8);
    }

    @Override // S0.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e f(String str) {
        y();
        this.f11065c.value(str);
        return this;
    }

    public e m(String str, double d8) {
        y();
        this.f11065c.name(str);
        return h(d8);
    }

    public e n(String str, int i8) {
        y();
        this.f11065c.name(str);
        return i(i8);
    }

    public e o(String str, long j8) {
        y();
        this.f11065c.name(str);
        return j(j8);
    }

    public e p(String str, Object obj) {
        if (this.f11069g) {
            return x(str, obj);
        }
        return w(str, obj);
    }

    public e q(String str, boolean z8) {
        y();
        this.f11065c.name(str);
        return g(z8);
    }

    @Override // S0.g
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z8) {
        y();
        this.f11065c.value(z8);
        return this;
    }

    public e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f11065c.nullValue();
        } else {
            this.f11065c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        y();
        this.f11065c.flush();
    }

    e v(S0.d dVar, Object obj, boolean z8) {
        if (!z8) {
            this.f11065c.beginObject();
        }
        dVar.a(obj, this);
        if (!z8) {
            this.f11065c.endObject();
        }
        return this;
    }
}
