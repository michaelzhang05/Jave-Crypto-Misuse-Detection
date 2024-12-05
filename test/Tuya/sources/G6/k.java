package g6;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes5.dex */
public abstract class k {
    public static final /* synthetic */ h a(Matcher matcher, int i8, CharSequence charSequence) {
        return d(matcher, i8, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(Matcher matcher, int i8, CharSequence charSequence) {
        if (!matcher.find(i8)) {
            return null;
        }
        return new i(matcher, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d6.i e(MatchResult matchResult) {
        return d6.m.s(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d6.i f(MatchResult matchResult, int i8) {
        return d6.m.s(matchResult.start(i8), matchResult.end(i8));
    }
}
