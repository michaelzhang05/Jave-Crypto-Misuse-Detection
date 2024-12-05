package x6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3943e extends AbstractC3957q {

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f39551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943e(t6.b element) {
        super(element);
        AbstractC3159y.i(element, "element");
        this.f39551b = new C3941d(element.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List q(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<this>");
        return arrayList;
    }

    @Override // x6.AbstractC3956p, t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f39551b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList f() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ArrayList arrayList, int i8) {
        AbstractC3159y.i(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(ArrayList arrayList, int i8, Object obj) {
        AbstractC3159y.i(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList p(List list) {
        ArrayList arrayList;
        AbstractC3159y.i(list, "<this>");
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
