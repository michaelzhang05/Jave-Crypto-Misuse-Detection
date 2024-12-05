package Y5;

import b6.InterfaceC1985a;
import i6.InterfaceC2998g;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f13571a;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private String f13572a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f13573b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f13572a;
                this.f13572a = null;
                AbstractC3255y.f(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13572a == null && !this.f13573b) {
                String readLine = h.this.f13571a.readLine();
                this.f13572a = readLine;
                if (readLine == null) {
                    this.f13573b = true;
                }
            }
            if (this.f13572a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(BufferedReader reader) {
        AbstractC3255y.i(reader, "reader");
        this.f13571a = reader;
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        return new a();
    }
}
