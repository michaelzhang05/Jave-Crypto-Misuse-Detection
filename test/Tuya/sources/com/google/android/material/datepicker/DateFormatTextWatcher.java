package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String formatHint;
    private int lastLength = 0;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;

    @NonNull
    private final TextInputLayout textInputLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateFormatTextWatcher(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.formatHint = str;
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.setErrorCallback = new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.this.lambda$new$0(str);
            }
        };
    }

    private Runnable createRangeErrorCallback(final long j8) {
        return new Runnable() { // from class: com.google.android.material.datepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher.this.lambda$createRangeErrorCallback$1(j8);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createRangeErrorCallback$1(long j8) {
        this.textInputLayout.setError(String.format(this.outOfRange, sanitizeDateString(DateStrings.getDateString(j8))));
        onInvalidDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(String str) {
        TextInputLayout textInputLayout = this.textInputLayout;
        DateFormat dateFormat = this.dateFormat;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), sanitizeDateString(str)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), sanitizeDateString(dateFormat.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis())))));
        onInvalidDate();
    }

    private String sanitizeDateString(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.formatHint.length() && editable.length() >= this.lastLength) {
            char charAt = this.formatHint.charAt(editable.length());
            if (!Character.isLetterOrDigit(charAt)) {
                editable.append(charAt);
            }
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i8, int i9, int i10) {
        this.lastLength = charSequence.length();
    }

    void onInvalidDate() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i8, int i9, int i10) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError(null);
        onValidDate(null);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= this.formatHint.length()) {
            try {
                Date parse = this.dateFormat.parse(charSequence.toString());
                this.textInputLayout.setError(null);
                long time = parse.getTime();
                if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                    onValidDate(Long.valueOf(parse.getTime()));
                    return;
                }
                Runnable createRangeErrorCallback = createRangeErrorCallback(time);
                this.setRangeErrorCallback = createRangeErrorCallback;
                runValidation(this.textInputLayout, createRangeErrorCallback);
            } catch (ParseException unused) {
                runValidation(this.textInputLayout, this.setErrorCallback);
            }
        }
    }

    abstract void onValidDate(@Nullable Long l8);

    public void runValidation(View view, Runnable runnable) {
        view.post(runnable);
    }
}
