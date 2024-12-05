package h3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class j implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f32178a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f32179b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f32180c;

    public j(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f32178a = aVar;
        this.f32179b = aVar2;
        this.f32180c = aVar3;
    }

    public static j a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static PaymentAnalyticsRequestFactory c(Context context, Function0 function0, Set set) {
        return new PaymentAnalyticsRequestFactory(context, function0, set);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentAnalyticsRequestFactory get() {
        return c((Context) this.f32178a.get(), (Function0) this.f32179b.get(), (Set) this.f32180c.get());
    }
}
