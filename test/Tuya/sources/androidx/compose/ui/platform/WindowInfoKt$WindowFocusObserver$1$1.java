package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoKt$WindowFocusObserver$1$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ State<Function1> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function0 {
        final /* synthetic */ WindowInfo $windowInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WindowInfo windowInfo) {
            super(0);
            this.$windowInfo = windowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$windowInfo.isWindowFocused());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends Function1> state, P5.d dVar) {
        super(2, dVar);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, dVar);
    }

    @Override // X5.n
    public final Object invoke(i6.M m8, P5.d dVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
            InterfaceC3358f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$windowInfo));
            final State<Function1> state = this.$callback;
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // l6.InterfaceC3359g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, P5.d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), dVar);
                }

                public final Object emit(boolean z8, P5.d dVar) {
                    state.getValue().invoke(kotlin.coroutines.jvm.internal.b.a(z8));
                    return L5.I.f6487a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        return L5.I.f6487a;
    }
}
