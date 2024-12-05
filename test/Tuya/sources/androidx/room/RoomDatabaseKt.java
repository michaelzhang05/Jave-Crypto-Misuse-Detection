package androidx.room;

import L5.I;
import L5.s;
import P5.g;
import i6.AbstractC2827j;
import i6.C2839p;
import i6.InterfaceC2837o;
import i6.InterfaceC2855x0;
import i6.M;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, final InterfaceC2855x0 interfaceC2855x0, P5.d dVar) {
        final C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        c2839p.j(new RoomDatabaseKt$acquireTransactionThread$2$1(interfaceC2855x0));
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", l = {125}, m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
                    final /* synthetic */ InterfaceC2837o $continuation;
                    final /* synthetic */ InterfaceC2855x0 $controlJob;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(InterfaceC2837o interfaceC2837o, InterfaceC2855x0 interfaceC2855x0, P5.d dVar) {
                        super(2, dVar);
                        this.$continuation = interfaceC2837o;
                        this.$controlJob = interfaceC2855x0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final P5.d create(Object obj, P5.d dVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$continuation, this.$controlJob, dVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // X5.n
                    public final Object invoke(M m8, P5.d dVar) {
                        return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = Q5.b.e();
                        int i8 = this.label;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                L5.t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            L5.t.b(obj);
                            M m8 = (M) this.L$0;
                            InterfaceC2837o interfaceC2837o = this.$continuation;
                            s.a aVar = L5.s.f6511b;
                            g.b bVar = m8.getCoroutineContext().get(P5.e.f7991a0);
                            AbstractC3159y.f(bVar);
                            interfaceC2837o.resumeWith(L5.s.b(bVar));
                            InterfaceC2855x0 interfaceC2855x0 = this.$controlJob;
                            this.label = 1;
                            if (interfaceC2855x0.e(this) == e8) {
                                return e8;
                            }
                        }
                        return I.f6487a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2827j.b(null, new AnonymousClass1(InterfaceC2837o.this, interfaceC2855x0, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e8) {
            c2839p.v(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e8));
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
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
    public static final java.lang.Object createTransactionContext(androidx.room.RoomDatabase r6, P5.d r7) {
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
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            i6.A r6 = (i6.InterfaceC2802A) r6
            java.lang.Object r0 = r0.L$0
            androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
            L5.t.b(r7)
            goto L6c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            L5.t.b(r7)
            r7 = 0
            i6.A r7 = i6.B0.b(r7, r3, r7)
            P5.g r2 = r0.getContext()
            i6.x0$b r4 = i6.InterfaceC2855x0.f31809n0
            P5.g$b r2 = r2.get(r4)
            i6.x0 r2 = (i6.InterfaceC2855x0) r2
            if (r2 == 0) goto L57
            androidx.room.RoomDatabaseKt$createTransactionContext$2 r4 = new androidx.room.RoomDatabaseKt$createTransactionContext$2
            r4.<init>(r7)
            r2.u(r4)
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
            P5.e r7 = (P5.e) r7
            androidx.room.TransactionElement r1 = new androidx.room.TransactionElement
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.getSuspendingTransactionId()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.c(r6)
            i6.V0 r6 = i6.W0.a(r0, r6)
            P5.g r7 = r7.plus(r1)
            P5.g r6 = r7.plus(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.createTransactionContext(androidx.room.RoomDatabase, P5.d):java.lang.Object");
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
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase r5, kotlin.jvm.functions.Function1 r6, P5.d r7) {
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
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r7)
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
            L5.t.b(r7)
            goto L66
        L41:
            L5.t.b(r7)
            P5.g r7 = r0.getContext()
            androidx.room.TransactionElement$Key r2 = androidx.room.TransactionElement.Key
            P5.g$b r7 = r7.get(r2)
            androidx.room.TransactionElement r7 = (androidx.room.TransactionElement) r7
            if (r7 == 0) goto L59
            P5.e r7 = r7.getTransactionDispatcher$room_ktx_release()
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
            P5.g r7 = (P5.g) r7
        L68:
            androidx.room.RoomDatabaseKt$withTransaction$2 r2 = new androidx.room.RoomDatabaseKt$withTransaction$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.withTransaction(androidx.room.RoomDatabase, kotlin.jvm.functions.Function1, P5.d):java.lang.Object");
    }
}
