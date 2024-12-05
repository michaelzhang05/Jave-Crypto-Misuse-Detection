package z1;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static List f41075a;

    /* renamed from: b, reason: collision with root package name */
    public static Map f41076b;

    static {
        HashMap hashMap = new HashMap();
        f41076b = hashMap;
        hashMap.put(Integer.valueOf(h.f41083d), h.f41085f);
        f41076b.put(Integer.valueOf(g.f41077d), g.f41079f);
        f41076b.put(Integer.valueOf(o.f41113b), o.f41115d);
        f41076b.put(Integer.valueOf(l.f41101d), l.f41103f);
        f41076b.put(Integer.valueOf(i.f41089d), i.f41091f);
        f41076b.put(Integer.valueOf(n.f41109d), n.f41111f);
        f41076b.put(Integer.valueOf(j.f41093d), j.f41095f);
        f41076b.put(Integer.valueOf(m.f41105d), m.f41107f);
        f41076b.put(Integer.valueOf(k.f41097d), k.f41099f);
        f41075a = (List) Collection.EL.stream(new ArrayList(f41076b.keySet())).sorted().map(new Function() { // from class: z1.e
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String b8;
                b8 = f.b((Integer) obj);
                return b8;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(Integer num) {
        return (String) f41076b.get(num);
    }
}
