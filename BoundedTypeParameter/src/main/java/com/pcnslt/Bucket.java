package com.pcnslt;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bucket<T> {

    private T item;

}
