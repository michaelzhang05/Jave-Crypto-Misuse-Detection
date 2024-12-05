package c5;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import d5.InterfaceC2755a;
import f5.C2839d;
import g5.C2880a;
import kotlin.coroutines.jvm.internal.l;
import l6.M;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2048b extends l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f15730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2047a f15731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2755a f15733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2048b(C2047a c2047a, String str, InterfaceC2755a interfaceC2755a, S5.d dVar) {
        super(2, dVar);
        this.f15731b = c2047a;
        this.f15732c = str;
        this.f15733d = interfaceC2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C2048b(this.f15731b, this.f15732c, this.f15733d, dVar);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2048b) create((M) obj, (S5.d) obj2)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object e8 = T5.b.e();
        int i8 = this.f15730a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            context = this.f15731b.f15729a;
            C2839d b8 = new C2880a(context).b(this.f15732c);
            C2047a c2047a = this.f15731b;
            InterfaceC2755a interfaceC2755a = this.f15733d;
            this.f15730a = 1;
            if (C2047a.b(c2047a, b8, interfaceC2755a, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
