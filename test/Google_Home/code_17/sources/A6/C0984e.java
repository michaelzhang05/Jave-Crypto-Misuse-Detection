package A6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0984e extends AbstractC0998q {

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984e(w6.b element) {
        super(element);
        AbstractC3255y.i(element, "element");
        this.f546b = new C0982d(element.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List q(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<this>");
        return arrayList;
    }

    @Override // A6.AbstractC0997p, w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f546b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList f() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ArrayList arrayList, int i8) {
        AbstractC3255y.i(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(ArrayList arrayList, int i8, Object obj) {
        AbstractC3255y.i(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList p(List list) {
        ArrayList arrayList;
        AbstractC3255y.i(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList(list);
        }
        return arrayList;
    }
}
