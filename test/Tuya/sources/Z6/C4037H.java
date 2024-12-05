package z6;

import M5.a0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v6.j;
import y6.AbstractC3999a;
import y6.AbstractC4007i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.H, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4037H extends AbstractC4043c {

    /* renamed from: f, reason: collision with root package name */
    private final y6.v f40488f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40489g;

    /* renamed from: h, reason: collision with root package name */
    private final v6.f f40490h;

    /* renamed from: i, reason: collision with root package name */
    private int f40491i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40492j;

    public /* synthetic */ C4037H(AbstractC3999a abstractC3999a, y6.v vVar, String str, v6.f fVar, int i8, AbstractC3151p abstractC3151p) {
        this(abstractC3999a, vVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(v6.f fVar, int i8) {
        boolean z8;
        if (!c().d().h() && !fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f40492j = z8;
        return z8;
    }

    private final boolean v0(v6.f fVar, int i8, String str) {
        y6.x xVar;
        AbstractC3999a c8 = c();
        v6.f h8 = fVar.h(i8);
        if (!h8.c() && (e0(str) instanceof y6.t)) {
            return true;
        }
        if (AbstractC3159y.d(h8.getKind(), j.b.f38925a) && (!h8.c() || !(e0(str) instanceof y6.t))) {
            AbstractC4007i e02 = e0(str);
            String str2 = null;
            if (e02 instanceof y6.x) {
                xVar = (y6.x) e02;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                str2 = y6.j.d(xVar);
            }
            if (str2 != null && AbstractC4032C.h(h8, c8, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // z6.AbstractC4043c, w6.c
    public void a(v6.f descriptor) {
        Set set;
        Set m8;
        AbstractC3159y.i(descriptor, "descriptor");
        if (!this.f40553e.i() && !(descriptor.getKind() instanceof v6.d)) {
            AbstractC4032C.l(descriptor, c());
            if (!this.f40553e.m()) {
                m8 = x6.I.a(descriptor);
            } else {
                Set a8 = x6.I.a(descriptor);
                Map map = (Map) y6.z.a(c()).a(descriptor, AbstractC4032C.f());
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
                if (!m8.contains(str) && !AbstractC3159y.d(str, this.f40489g)) {
                    throw AbstractC4031B.f(str, s0().toString());
                }
            }
        }
    }

    @Override // x6.V
    protected String a0(v6.f descriptor, int i8) {
        Object obj;
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC4032C.l(descriptor, c());
        String f8 = descriptor.f(i8);
        if (!this.f40553e.m()) {
            return f8;
        }
        if (s0().keySet().contains(f8)) {
            return f8;
        }
        Map e8 = AbstractC4032C.e(c(), descriptor);
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

    @Override // z6.AbstractC4043c, w6.e
    public w6.c d(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (descriptor == this.f40490h) {
            AbstractC3999a c8 = c();
            AbstractC4007i f02 = f0();
            v6.f fVar = this.f40490h;
            if (f02 instanceof y6.v) {
                return new C4037H(c8, (y6.v) f02, this.f40489g, fVar);
            }
            throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(y6.v.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        return super.d(descriptor);
    }

    @Override // z6.AbstractC4043c
    protected AbstractC4007i e0(String tag) {
        AbstractC3159y.i(tag, "tag");
        return (AbstractC4007i) M5.Q.i(s0(), tag);
    }

    @Override // w6.c
    public int p(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        while (this.f40491i < descriptor.e()) {
            int i8 = this.f40491i;
            this.f40491i = i8 + 1;
            String V7 = V(descriptor, i8);
            int i9 = this.f40491i - 1;
            this.f40492j = false;
            if (s0().containsKey(V7) || u0(descriptor, i9)) {
                if (!this.f40553e.e() || !v0(descriptor, i9, V7)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // z6.AbstractC4043c, w6.e
    public boolean w() {
        if (!this.f40492j && super.w()) {
            return true;
        }
        return false;
    }

    @Override // z6.AbstractC4043c
    /* renamed from: w0 */
    public y6.v s0() {
        return this.f40488f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4037H(AbstractC3999a json, y6.v value, String str, v6.f fVar) {
        super(json, value, null);
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(value, "value");
        this.f40488f = value;
        this.f40489g = str;
        this.f40490h = fVar;
    }
}
