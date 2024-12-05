package androidx.room;

import O5.I;
import O5.s;
import S5.g;
import a6.InterfaceC1668n;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3362j;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.InterfaceC3390x0;
import l6.M;

/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, final InterfaceC3390x0 interfaceC3390x0, S5.d dVar) {
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        c3374p.i(new RoomDatabaseKt$acquireTransactionThread$2$1(interfaceC3390x0));
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", l = {125}, m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
                    final /* synthetic */ InterfaceC3372o $continuation;
                    final /* synthetic */ InterfaceC3390x0 $controlJob;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(InterfaceC3372o interfaceC3372o, InterfaceC3390x0 interfaceC3390x0, S5.d dVar) {
                        super(2, dVar);
                        this.$continuation = interfaceC3372o;
                        this.$controlJob = interfaceC3390x0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final S5.d create(Object obj, S5.d dVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$continuation, this.$controlJob, dVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = T5.b.e();
                        int i8 = this.label;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                O5.t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            O5.t.b(obj);
                            M m8 = (M) this.L$0;
                            InterfaceC3372o interfaceC3372o = this.$continuation;
                            s.a aVar = O5.s.f8302b;
                            g.b bVar = m8.getCoroutineContext().get(S5.e.f9822a0);
                            AbstractC3255y.f(bVar);
                            interfaceC3372o.resumeWith(O5.s.b(bVar));
                            InterfaceC3390x0 interfaceC3390x0 = this.$controlJob;
                            this.label = 1;
                            if (interfaceC3390x0.y(this) == e8) {
                                return e8;
                            }
                        }
                        return I.f8278a;
                    }

                    @Override // a6.InterfaceC1668n
                    public final Object invoke(M m8, S5.d dVar) {
                        return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8278a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3362j.b(null, new AnonymousClass1(InterfaceC3372o.this, interfaceC3390x0, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e8) {
            c3374p.t(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e8));
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object createTransactionContext(androidx.room.RoomDatabase r6, S5.d r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$createTransactionContext$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = (androidx.room.RoomDatabaseKt$createTransactionContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = new androidx.room.RoomDatabaseKt$createTransactionContext$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            l6.A r6 = (l6.InterfaceC3337A) r6
            java.lang.Object r0 = r0.L$0
            androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
            O5.t.b(r7)
            goto L6c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            O5.t.b(r7)
            r7 = 0
            l6.A r7 = l6.B0.b(r7, r3, r7)
            S5.g r2 = r0.getContext()
            l6.x0$b r4 = l6.InterfaceC3390x0.f34661n0
            S5.g$b r2 = r2.get(r4)
            l6.x0 r2 = (l6.InterfaceC3390x0) r2
            if (r2 == 0) goto L57
            androidx.room.RoomDatabaseKt$createTransactionContext$2 r4 = new androidx.room.RoomDatabaseKt$createTransactionContext$2
            r4.<init>(r7)
            r2.s(r4)
        L57:
            java.util.concurrent.Executor r2 = r6.getTransactionExecutor()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = acquireTransactionThread(r2, r7, r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            S5.e r7 = (S5.e) r7
            androidx.room.TransactionElement r1 = new androidx.room.TransactionElement
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.getSuspendingTransactionId()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.c(r6)
            l6.V0 r6 = l6.W0.a(r0, r6)
            S5.g r7 = r7.plus(r1)
            S5.g r6 = r7.plus(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.createTransactionContext(androidx.room.RoomDatabase, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[PHI: r7
      0x007b: PHI (r7v11 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:18:0x0078, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase r5, kotlin.jvm.functions.Function1 r6, S5.d r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$withTransaction$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = (androidx.room.RoomDatabaseKt$withTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = new androidx.room.RoomDatabaseKt$withTransaction$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r7)
            goto L7b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            O5.t.b(r7)
            goto L66
        L41:
            O5.t.b(r7)
            S5.g r7 = r0.getContext()
            androidx.room.TransactionElement$Key r2 = androidx.room.TransactionElement.Key
            S5.g$b r7 = r7.get(r2)
            androidx.room.TransactionElement r7 = (androidx.room.TransactionElement) r7
            if (r7 == 0) goto L59
            S5.e r7 = r7.getTransactionDispatcher$room_ktx_release()
            if (r7 == 0) goto L59
            goto L68
        L59:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = createTransactionContext(r5, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            S5.g r7 = (S5.g) r7
        L68:
            androidx.room.RoomDatabaseKt$withTransaction$2 r2 = new androidx.room.RoomDatabaseKt$withTransaction$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.withTransaction(androidx.room.RoomDatabase, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }
}
