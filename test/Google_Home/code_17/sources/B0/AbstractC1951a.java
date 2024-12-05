package b0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1951a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f15039a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15040b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1951a(IBinder iBinder, String str) {
        this.f15039a = iBinder;
        this.f15040b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15039a;
    }
}
