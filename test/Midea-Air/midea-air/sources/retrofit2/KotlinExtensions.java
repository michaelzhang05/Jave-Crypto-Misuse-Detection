package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.d;
import kotlin.coroutines.j.internal.g;
import kotlin.jvm.internal.l;
import kotlin.o;
import kotlinx.coroutines.m;
import okhttp3.HttpUrl;

/* compiled from: KotlinExtensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/y/d;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", HttpUrl.FRAGMENT_ENCODE_SET, "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/y/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, Continuation<? super T> continuation) {
        Continuation b2;
        Object c2;
        b2 = kotlin.coroutines.intrinsics.c.b(continuation);
        final m mVar = new m(b2, 1);
        mVar.d(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                l.g(call2, "call");
                l.g(t, "t");
                kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                Result.a aVar = Result.f21603f;
                lVar.resumeWith(Result.a(o.a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                l.g(call2, "call");
                l.g(response, "response");
                if (response.isSuccessful()) {
                    T body = response.body();
                    if (body == null) {
                        Object tag = call2.request().tag(Invocation.class);
                        if (tag == null) {
                            l.p();
                        }
                        l.b(tag, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) tag).method();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        l.b(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        l.b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                        kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                        Result.a aVar = Result.f21603f;
                        lVar.resumeWith(Result.a(o.a(kotlinNullPointerException)));
                        return;
                    }
                    kotlinx.coroutines.l lVar2 = kotlinx.coroutines.l.this;
                    Result.a aVar2 = Result.f21603f;
                    lVar2.resumeWith(Result.a(body));
                    return;
                }
                kotlinx.coroutines.l lVar3 = kotlinx.coroutines.l.this;
                HttpException httpException = new HttpException(response);
                Result.a aVar3 = Result.f21603f;
                lVar3.resumeWith(Result.a(o.a(httpException)));
            }
        });
        Object t = mVar.t();
        c2 = d.c();
        if (t == c2) {
            g.c(continuation);
        }
        return t;
    }

    public static final <T> Object awaitNullable(Call<T> call, Continuation<? super T> continuation) {
        Continuation b2;
        Object c2;
        b2 = kotlin.coroutines.intrinsics.c.b(continuation);
        final m mVar = new m(b2, 1);
        mVar.d(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                l.g(call2, "call");
                l.g(t, "t");
                kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                Result.a aVar = Result.f21603f;
                lVar.resumeWith(Result.a(o.a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                l.g(call2, "call");
                l.g(response, "response");
                if (response.isSuccessful()) {
                    kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                    T body = response.body();
                    Result.a aVar = Result.f21603f;
                    lVar.resumeWith(Result.a(body));
                    return;
                }
                kotlinx.coroutines.l lVar2 = kotlinx.coroutines.l.this;
                HttpException httpException = new HttpException(response);
                Result.a aVar2 = Result.f21603f;
                lVar2.resumeWith(Result.a(o.a(httpException)));
            }
        });
        Object t = mVar.t();
        c2 = d.c();
        if (t == c2) {
            g.c(continuation);
        }
        return t;
    }

    public static final <T> Object awaitResponse(Call<T> call, Continuation<? super Response<T>> continuation) {
        Continuation b2;
        Object c2;
        b2 = kotlin.coroutines.intrinsics.c.b(continuation);
        final m mVar = new m(b2, 1);
        mVar.d(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                l.g(call2, "call");
                l.g(t, "t");
                kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                Result.a aVar = Result.f21603f;
                lVar.resumeWith(Result.a(o.a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                l.g(call2, "call");
                l.g(response, "response");
                kotlinx.coroutines.l lVar = kotlinx.coroutines.l.this;
                Result.a aVar = Result.f21603f;
                lVar.resumeWith(Result.a(response));
            }
        });
        Object t = mVar.t();
        c2 = d.c();
        if (t == c2) {
            g.c(continuation);
        }
        return t;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        l.g(retrofit, "$this$create");
        l.j(4, "T");
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.o.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.o.b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.c0 r5 = kotlinx.coroutines.u0.a()
            kotlin.y.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.s0(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.c()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.c()
            if (r4 != r5) goto L59
            kotlin.coroutines.j.internal.g.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.u r4 = kotlin.u.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.y.d):java.lang.Object");
    }
}
