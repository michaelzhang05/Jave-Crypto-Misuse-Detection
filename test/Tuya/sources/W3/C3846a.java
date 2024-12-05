package w3;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import M5.Q;
import X5.p;
import g6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import r4.C3688a;
import y3.AbstractC3991f;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3846a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358f f38998a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3358f f38999b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3358f f39000c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f39001d;

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0902a extends l implements p {

        /* renamed from: a, reason: collision with root package name */
        int f39002a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f39003b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f39004c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f39005d;

        C0902a(P5.d dVar) {
            super(4, dVar);
        }

        @Override // X5.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, Set set, AbstractC3991f.a aVar, P5.d dVar) {
            C0902a c0902a = new C0902a(dVar);
            c0902a.f39003b = map;
            c0902a.f39004c = set;
            c0902a.f39005d = aVar;
            return c0902a.invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f39002a == 0) {
                t.b(obj);
                Map map = (Map) this.f39003b;
                Set set = (Set) this.f39004c;
                AbstractC3991f.a aVar = (AbstractC3991f.a) this.f39005d;
                C3846a c3846a = C3846a.this;
                return c3846a.d(map, set, aVar, c3846a.f39001d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3846a(InterfaceC3358f currentFieldValueMap, InterfaceC3358f hiddenIdentifiers, InterfaceC3358f userRequestedReuse, Map defaultValues) {
        AbstractC3159y.i(currentFieldValueMap, "currentFieldValueMap");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3159y.i(userRequestedReuse, "userRequestedReuse");
        AbstractC3159y.i(defaultValues, "defaultValues");
        this.f38998a = currentFieldValueMap;
        this.f38999b = hiddenIdentifiers;
        this.f39000c = userRequestedReuse;
        this.f39001d = defaultValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c d(Map map, Set set, AbstractC3991f.a aVar, Map map2) {
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
            C3688a c3688a = (C3688a) B8.get(entry2.getKey());
            if (c3688a != null) {
                str = c3688a.c();
            }
            if (str == null || n.u(str)) {
                CharSequence charSequence = (CharSequence) entry2.getValue();
                if (charSequence != null && !n.u(charSequence)) {
                    B8.put(entry2.getKey(), new C3688a((String) entry2.getValue(), true));
                }
            }
        }
        c cVar = new c(B8, aVar);
        Collection values = B8.values();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(values, 10));
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((C3688a) it2.next()).d()));
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

    public final InterfaceC3358f c() {
        return AbstractC3360h.j(this.f38998a, this.f38999b, this.f39000c, new C0902a(null));
    }
}
