package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class d extends AbstractC3026a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f33364b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f33356b;
        Object obj2 = lVar.f33357c;
        this.f33344j = lVar;
        a();
        return new k(obj, obj2, this.f33343i);
    }
}
