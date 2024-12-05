package O6;

import S6.InterfaceC1419g;
import java.util.List;

/* loaded from: classes5.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f8495a = new a();

    void a(int i8, b bVar);

    boolean b(int i8, InterfaceC1419g interfaceC1419g, int i9, boolean z8);

    boolean onHeaders(int i8, List list, boolean z8);

    boolean onRequest(int i8, List list);

    /* loaded from: classes5.dex */
    final class a implements l {
        a() {
        }

        @Override // O6.l
        public boolean b(int i8, InterfaceC1419g interfaceC1419g, int i9, boolean z8) {
            interfaceC1419g.skip(i9);
            return true;
        }

        @Override // O6.l
        public boolean onHeaders(int i8, List list, boolean z8) {
            return true;
        }

        @Override // O6.l
        public boolean onRequest(int i8, List list) {
            return true;
        }

        @Override // O6.l
        public void a(int i8, b bVar) {
        }
    }
}
