package x0;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w0.AbstractC4123f;

/* loaded from: classes3.dex */
public abstract class w {

    /* loaded from: classes3.dex */
    class a extends S {

        /* renamed from: a, reason: collision with root package name */
        boolean f40666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f40667b;

        a(Object obj) {
            this.f40667b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f40666a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f40666a) {
                this.f40666a = true;
                return this.f40667b;
            }
            throw new NoSuchElementException();
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        w0.h.i(collection);
        w0.h.i(it);
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= collection.add(it.next());
        }
        return z8;
    }

    public static boolean b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC4123f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static S c(Object obj) {
        return new a(obj);
    }
}
