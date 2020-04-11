#!/usr/bin/env python3
import pandas

def main():
    columns = [
        'price',
        'bankrollWithStock',
        'bankrollWithoutStock'
    ]
    # for each stage, what actions lead to this result?
    data = [
        ['price','bankrollWithStock','bankrollWithoutStock']
        [float('nan'), -float('inf'), 0],
        [7, -7, 0],
        [1, -1, 0],
        [5, -1, 4],
        [3, 1, 4],
        [6, 1, 7],
        [4, 1, 7],
    ]
    iterations = pandas.DataFrame(data, columns=columns)
    print(iterations)
if __name__ == "__main__":
    main()



