package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class d extends AbstractC2876a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f32170b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f32162b;
        Object obj2 = lVar.f32163c;
        this.f32150j = lVar;
        a();
        return new k(obj, obj2, this.f32149i);
    }
}
