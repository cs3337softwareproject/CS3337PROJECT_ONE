private static DoubleyLinkedList<CardReader> mergeSort(DoubleyLinkedList<CardReader> cardReader)
	{
		if(cardReader.size() <= 1)
			return cardReader;
		DoubleyLinkedList<CardReader> left = new  DoubleyLinkedList<CardReader>();
		DoubleyLinkedList<CardReader> right = new  DoubleyLinkedList<CardReader>();
		int middle = cardReader.size() / 2;
		
		for(int i = 0; i < middle; i++)
			left.add(cardReader.get(i));
		for(int i = middle; i < cardReader.size(); i++)
			right.add(cardReader.get(i));
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
			
	}
	
	private static DoubleyLinkedList<CardReader> merge(DoubleyLinkedList<CardReader> left, DoubleyLinkedList<CardReader> right)
	{
		DoubleyLinkedList<CardReader> read1 = new DoubleyLinkedList<CardReader>();
		while(left.size() > 0 || right.size() > 0)
		{
			if(left.size() > 0 && right.size() > 0)
			{
				if(	left.get(0).getStudentDob() < right.get(0).getStudentDob() ||
					(left.get(0).getStudentDob() == right.get(0).getStudentDob() &&
					left.get(0).getStudentCin() < right.get(0).getStudentCin())	
						
					)
				{
					read1.add(left.get(0));
					left.remove(0);
				}
				else
				{
					read1.add(right.get(0));
					right.remove(0);
				}
			}
			else if(left.size() > 0)
			{
				read1.add(left.get(0));
				left.remove(0);
			}
			else if(right.size() > 0)
			{
				read1.add(right.get(0));
				right.remove(0);
			}
		}
		return read1;
	}
