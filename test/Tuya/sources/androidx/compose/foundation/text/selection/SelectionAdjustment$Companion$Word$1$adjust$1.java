package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3156v;

/* loaded from: classes.dex */
/* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends C3156v implements Function1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m4680boximpl(m1024invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m1024invokejx7JFs(int i8) {
        return ((TextLayoutResult) this.receiver).m4666getWordBoundaryjx7JFs(i8);
    }
}
