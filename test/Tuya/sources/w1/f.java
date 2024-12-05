package w1;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static List f38952a;

    /* renamed from: b, reason: collision with root package name */
    public static Map f38953b;

    static {
        HashMap hashMap = new HashMap();
        f38953b = hashMap;
        hashMap.put(Integer.valueOf(h.f38960d), h.f38962f);
        f38953b.put(Integer.valueOf(g.f38954d), g.f38956f);
        f38953b.put(Integer.valueOf(o.f38990b), o.f38992d);
        f38953b.put(Integer.valueOf(l.f38978d), l.f38980f);
        f38953b.put(Integer.valueOf(i.f38966d), i.f38968f);
        f38953b.put(Integer.valueOf(n.f38986d), n.f38988f);
        f38953b.put(Integer.valueOf(j.f38970d), j.f38972f);
        f38953b.put(Integer.valueOf(m.f38982d), m.f38984f);
        f38953b.put(Integer.valueOf(k.f38974d), k.f38976f);
        f38952a = (List) Collection.EL.stream(new ArrayList(f38953b.keySet())).sorted().map(new Function() { // from class: w1.e
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
        return (String) f38953b.get(num);
    }
}
