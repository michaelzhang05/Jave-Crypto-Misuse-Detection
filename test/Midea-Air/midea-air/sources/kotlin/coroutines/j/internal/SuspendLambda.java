package kotlin.coroutines.j.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/SuspendLambda;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "arity", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "completion", "Lkotlin/coroutines/Continuation;", "(ILkotlin/coroutines/Continuation;)V", "getArity", "()I", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.y.j.a.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class SuspendLambda extends ContinuationImpl implements FunctionBase<Object> {
    private final int arity;

    public SuspendLambda(int i2, Continuation<Object> continuation) {
        super(continuation);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() == null) {
            String h2 = b0.h(this);
            l.e(h2, "renderLambdaToString(this)");
            return h2;
        }
        return super.toString();
    }

    public SuspendLambda(int i2) {
        this(i2, null);
    }
}
