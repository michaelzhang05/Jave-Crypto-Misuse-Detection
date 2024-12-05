package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2040l3 implements InterfaceC2016i3 {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2016i3 f15754c = new InterfaceC2016i3() { // from class: com.google.android.gms.internal.measurement.k3
        @Override // com.google.android.gms.internal.measurement.InterfaceC2016i3
        public final Object a() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC2016i3 f15755a;

    /* renamed from: b, reason: collision with root package name */
    private Object f15756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2040l3(InterfaceC2016i3 interfaceC2016i3) {
        interfaceC2016i3.getClass();
        this.f15755a = interfaceC2016i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2016i3
    public final Object a() {
        InterfaceC2016i3 interfaceC2016i3 = this.f15755a;
        InterfaceC2016i3 interfaceC2016i32 = f15754c;
        if (interfaceC2016i3 != interfaceC2016i32) {
            synchronized (this) {
                try {
                    if (this.f15755a != interfaceC2016i32) {
                        Object a8 = this.f15755a.a();
                        this.f15756b = a8;
                        this.f15755a = interfaceC2016i32;
                        return a8;
                    }
                } finally {
                }
            }
        }
        return this.f15756b;
    }

    public final String toString() {
        Object obj = this.f15755a;
        if (obj == f15754c) {
            obj = "<supplier that returned " + String.valueOf(this.f15756b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
