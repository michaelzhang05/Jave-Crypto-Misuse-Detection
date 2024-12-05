package C6;

import P5.a0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import y6.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class H extends AbstractC1032c {

    /* renamed from: f, reason: collision with root package name */
    private final B6.v f1606f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1607g;

    /* renamed from: h, reason: collision with root package name */
    private final y6.f f1608h;

    /* renamed from: i, reason: collision with root package name */
    private int f1609i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1610j;

    public /* synthetic */ H(B6.a aVar, B6.v vVar, String str, y6.f fVar, int i8, AbstractC3247p abstractC3247p) {
        this(aVar, vVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(y6.f fVar, int i8) {
        boolean z8;
        if (!c().d().h() && !fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f1610j = z8;
        return z8;
    }

    private final boolean v0(y6.f fVar, int i8, String str) {
        B6.x xVar;
        B6.a c8 = c();
        y6.f h8 = fVar.h(i8);
        if (!h8.c() && (e0(str) instanceof B6.t)) {
            return true;
        }
        if (AbstractC3255y.d(h8.getKind(), j.b.f41056a) && (!h8.c() || !(e0(str) instanceof B6.t))) {
            B6.i e02 = e0(str);
            String str2 = null;
            if (e02 instanceof B6.x) {
                xVar = (B6.x) e02;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                str2 = B6.j.d(xVar);
            }
            if (str2 != null && C.h(h8, c8, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.V
    protected String a0(y6.f descriptor, int i8) {
        Object obj;
        AbstractC3255y.i(descriptor, "descriptor");
        C.l(descriptor, c());
        String f8 = descriptor.f(i8);
        if (!this.f1671e.m()) {
            return f8;
        }
        if (s0().keySet().contains(f8)) {
            return f8;
        }
        Map e8 = C.e(c(), descriptor);
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) e8.get((String) obj);
                if (num != null && num.intValue() == i8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return f8;
    }

    @Override // C6.AbstractC1032c, z6.c
    public void b(y6.f descriptor) {
        Set set;
        Set m8;
        AbstractC3255y.i(descriptor, "descriptor");
        if (!this.f1671e.i() && !(descriptor.getKind() instanceof y6.d)) {
            C.l(descriptor, c());
            if (!this.f1671e.m()) {
                m8 = A6.I.a(descriptor);
            } else {
                Set a8 = A6.I.a(descriptor);
                Map map = (Map) B6.z.a(c()).a(descriptor, C.f());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = a0.f();
                }
                m8 = a0.m(a8, set);
            }
            for (String str : s0().keySet()) {
                if (!m8.contains(str) && !AbstractC3255y.d(str, this.f1607g)) {
                    throw B.f(str, s0().toString());
                }
            }
        }
    }

    @Override // C6.AbstractC1032c, z6.e
    public z6.c d(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (descriptor == this.f1608h) {
            B6.a c8 = c();
            B6.i f02 = f0();
            y6.f fVar = this.f1608h;
            if (f02 instanceof B6.v) {
                return new H(c8, (B6.v) f02, this.f1607g, fVar);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.v.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        return super.d(descriptor);
    }

    @Override // C6.AbstractC1032c
    protected B6.i e0(String tag) {
        AbstractC3255y.i(tag, "tag");
        return (B6.i) P5.Q.i(s0(), tag);
    }

    @Override // z6.c
    public int g(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        while (this.f1609i < descriptor.e()) {
            int i8 = this.f1609i;
            this.f1609i = i8 + 1;
            String V7 = V(descriptor, i8);
            int i9 = this.f1609i - 1;
            this.f1610j = false;
            if (s0().containsKey(V7) || u0(descriptor, i9)) {
                if (!this.f1671e.e() || !v0(descriptor, i9, V7)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // C6.AbstractC1032c, z6.e
    public boolean v() {
        if (!this.f1610j && super.v()) {
            return true;
        }
        return false;
    }

    @Override // C6.AbstractC1032c
    /* renamed from: w0 */
    public B6.v s0() {
        return this.f1606f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(B6.a json, B6.v value, String str, y6.f fVar) {
        super(json, value, null);
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(value, "value");
        this.f1606f = value;
        this.f1607g = str;
        this.f1608h = fVar;
    }
}
