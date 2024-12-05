package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends AbstractC3026a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f33349k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i8, int i9, ConcurrentHashMap concurrentHashMap, int i10) {
        super(lVarArr, i8, i9, concurrentHashMap);
        this.f33349k = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33349k) {
            case 0:
                l lVar = this.f33364b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f33344j = lVar;
                a();
                return lVar.f33356b;
            default:
                l lVar2 = this.f33364b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f33357c;
                this.f33344j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f33349k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
