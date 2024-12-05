package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    @ExperimentalFoundationApi
    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(bringIntoViewRequester, "bringIntoViewRequester");
        return modifier.then(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
