package z3;

import B3.f;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import P5.Q;
import a6.InterfaceC1670p;
import j6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import u4.C4061a;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4226a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3706f f41121a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3706f f41122b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3706f f41123c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f41124d;

    /* renamed from: z3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0938a extends l implements InterfaceC1670p {

        /* renamed from: a, reason: collision with root package name */
        int f41125a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41126b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41127c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41128d;

        C0938a(S5.d dVar) {
            super(4, dVar);
        }

        @Override // a6.InterfaceC1670p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, Set set, f.a aVar, S5.d dVar) {
            C0938a c0938a = new C0938a(dVar);
            c0938a.f41126b = map;
            c0938a.f41127c = set;
            c0938a.f41128d = aVar;
            return c0938a.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f41125a == 0) {
                t.b(obj);
                Map map = (Map) this.f41126b;
                Set set = (Set) this.f41127c;
                f.a aVar = (f.a) this.f41128d;
                C4226a c4226a = C4226a.this;
                return c4226a.d(map, set, aVar, c4226a.f41124d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C4226a(InterfaceC3706f currentFieldValueMap, InterfaceC3706f hiddenIdentifiers, InterfaceC3706f userRequestedReuse, Map defaultValues) {
        AbstractC3255y.i(currentFieldValueMap, "currentFieldValueMap");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3255y.i(userRequestedReuse, "userRequestedReuse");
        AbstractC3255y.i(defaultValues, "defaultValues");
        this.f41121a = currentFieldValueMap;
        this.f41122b = hiddenIdentifiers;
        this.f41123c = userRequestedReuse;
        this.f41124d = defaultValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c d(Map map, Set set, f.a aVar, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (true ^ set.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map B8 = Q.B(linkedHashMap);
        Iterator it = map2.entrySet().iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            C4061a c4061a = (C4061a) B8.get(entry2.getKey());
            if (c4061a != null) {
                str = c4061a.c();
            }
            if (str == null || n.u(str)) {
                CharSequence charSequence = (CharSequence) entry2.getValue();
                if (charSequence != null && !n.u(charSequence)) {
                    B8.put(entry2.getKey(), new C4061a((String) entry2.getValue(), true));
                }
            }
        }
        c cVar = new c(B8, aVar);
        Collection values = B8.values();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(values, 10));
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((C4061a) it2.next()).d()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!((Boolean) it3.next()).booleanValue()) {
                    return null;
                }
            }
        }
        return cVar;
    }

    public final InterfaceC3706f c() {
        return AbstractC3708h.l(this.f41121a, this.f41122b, this.f41123c, new C0938a(null));
    }
}
