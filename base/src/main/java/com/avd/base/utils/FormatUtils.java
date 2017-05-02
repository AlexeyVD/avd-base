package com.avd.base.utils;

import android.util.SparseArray;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public class FormatUtils {

    private static final SparseArray<NumberFormat> fixedNumberFormatCache = new SparseArray<>();
    private static final SparseArray<NumberFormat> numberFormatCache = new SparseArray<>();

    private static final NumberFormat FORMATTER_PERCENT = getNumberFormatter(2);

    private FormatUtils() {
    }

    public static String number(double value, int precision) {
        return getFixedNumberFormatter(precision).format(value);
    }

    public static String percent(double value) {
        return FORMATTER_PERCENT.format(value) + "%";
    }

    private static NumberFormat getFixedNumberFormatter(int precision) {

        NumberFormat format = fixedNumberFormatCache.get(precision);

        if (format != null) {
            return format;
        }

        NumberFormat newFormat = new DecimalFormat();
        newFormat.setMinimumFractionDigits(precision);
        newFormat.setMaximumFractionDigits(precision);
        newFormat.setRoundingMode(RoundingMode.DOWN);

        fixedNumberFormatCache.put(precision, newFormat);

        return newFormat;
    }

    private static NumberFormat getNumberFormatter(int precision) {

        NumberFormat format = numberFormatCache.get(precision);

        if (format != null) {
            return format;
        }

        NumberFormat newFormat = new DecimalFormat();
        newFormat.setMinimumFractionDigits(0);
        newFormat.setMaximumFractionDigits(precision);
        newFormat.setRoundingMode(RoundingMode.DOWN);

        numberFormatCache.put(precision, newFormat);

        return newFormat;
    }
}
