package androidx.compose.foundation;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import i6.AbstractC2829k;
import i6.M;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ M $indicationScope;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Offset> $keyClickOffset;
    final /* synthetic */ Function0 $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", l = {376}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ PressInteraction.Press $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, d dVar) {
            super(2, dVar);
            this.$interactionSource = mutableInteractionSource;
            this.$press = press;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$interactionSource, this.$press, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                PressInteraction.Press press = this.$press;
                this.label = 1;
                if (mutableInteractionSource.emit(press, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(boolean z8, Map<Key, PressInteraction.Press> map, State<Offset> state, M m8, Function0 function0, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z8;
        this.$currentKeyPressInteractions = map;
        this.$keyClickOffset = state;
        this.$indicationScope = m8;
        this.$onClick = function0;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m323invokeZmokQxo(((KeyEvent) obj).m3888unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m323invokeZmokQxo(android.view.KeyEvent keyEvent) {
        AbstractC3159y.i(keyEvent, "keyEvent");
        boolean z8 = false;
        if (this.$enabled && Clickable_androidKt.m330isPressZmokQxo(keyEvent)) {
            if (!this.$currentKeyPressInteractions.containsKey(Key.m3588boximpl(KeyEvent_androidKt.m3899getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.$keyClickOffset.getValue().m2745unboximpl(), null);
                this.$currentKeyPressInteractions.put(Key.m3588boximpl(KeyEvent_androidKt.m3899getKeyZmokQxo(keyEvent)), press);
                AbstractC2829k.d(this.$indicationScope, null, null, new AnonymousClass1(this.$interactionSource, press, null), 3, null);
                z8 = true;
            }
        } else if (this.$enabled && Clickable_androidKt.m328isClickZmokQxo(keyEvent)) {
            PressInteraction.Press remove = this.$currentKeyPressInteractions.remove(Key.m3588boximpl(KeyEvent_androidKt.m3899getKeyZmokQxo(keyEvent)));
            if (remove != null) {
                AbstractC2829k.d(this.$indicationScope, null, null, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.$interactionSource, remove, null), 3, null);
            }
            this.$onClick.invoke();
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
